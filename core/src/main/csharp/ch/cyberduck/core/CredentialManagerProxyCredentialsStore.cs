﻿// 
// Copyright (c) 2010-2018 Yves Langisch. All rights reserved.
// http://cyberduck.io/
// 
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
// 
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
// 
// Bug fixes, suggestions and comments should be sent to:
// feedback@cyberduck.io
// 

using System.Net;
using ch.cyberduck.core;
using Ch.Cyberduck.Core.CredentialManager;

namespace Ch.Cyberduck.Core
{
    public class CredentialManagerProxyCredentialsStore : ProxyCredentialsStore
    {
        public Credentials getCredentials(string proxy)
        {
            var credential = WinCredentialManager.GetCredentials(proxy);
            return new Credentials(credential.UserName, credential.Password);
        }

        public void addCredentials(string proxy, string user, string password)
        {
            WinCredentialManager.SaveCredentials(proxy, new NetworkCredential(user, password));
        }

        public void deleteCredentials(string proxy)
        {
            WinCredentialManager.RemoveCredentials(proxy);
        }
    }
}
