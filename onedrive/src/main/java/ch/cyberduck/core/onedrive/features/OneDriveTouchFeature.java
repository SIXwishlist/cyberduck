package ch.cyberduck.core.onedrive.features;

/*
 * Copyright (c) 2002-2018 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.DefaultIOExceptionMappingService;
import ch.cyberduck.core.MimeTypeService;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.URIEncoder;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Touch;
import ch.cyberduck.core.features.Write;
import ch.cyberduck.core.onedrive.OneDriveExceptionMappingService;
import ch.cyberduck.core.onedrive.OneDriveSession;
import ch.cyberduck.core.transfer.TransferStatus;

import org.apache.commons.lang3.StringUtils;
import org.nuxeo.onedrive.client.OneDriveAPIException;
import org.nuxeo.onedrive.client.OneDriveFile;
import org.nuxeo.onedrive.client.OneDriveFolder;
import org.nuxeo.onedrive.client.OneDriveItem;

import java.io.IOException;

public class OneDriveTouchFeature implements Touch<Void> {

    private final OneDriveSession session;

    public OneDriveTouchFeature(final OneDriveSession session) {
        this.session = session;
    }

    @Override
    public Path touch(final Path file, final TransferStatus status) throws BackgroundException {
        try {
            final OneDriveFolder folder = session.toFolder(file.getParent());
            final OneDriveFile oneDriveFile = new OneDriveFile(session.getClient(), folder,
                URIEncoder.encode(file.getName()), OneDriveItem.ItemIdentifierType.Path);
            oneDriveFile.create(StringUtils.isNotBlank(status.getMime()) ? status.getMime() : MimeTypeService.DEFAULT_CONTENT_TYPE);
        }
        catch(OneDriveAPIException e) {
            throw new OneDriveExceptionMappingService().map("Cannot create file {0}", e, file);
        }
        catch(IOException e) {
            throw new DefaultIOExceptionMappingService().map("Cannot create file {0}", e, file);
        }
        return file;
    }

    @Override
    public boolean isSupported(final Path workdir) {
        return !workdir.isRoot();
    }

    @Override
    public Touch<Void> withWriter(final Write writer) {
        return this;
    }
}
