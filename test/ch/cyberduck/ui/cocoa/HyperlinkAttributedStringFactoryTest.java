package ch.cyberduck.ui.cocoa;

import ch.cyberduck.core.AbstractTestCase;
import ch.cyberduck.core.DescriptiveUrl;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.assertEquals;

/**
 * @version $Id$
 */
public class HyperlinkAttributedStringFactoryTest extends AbstractTestCase {

    @Test
    public void testCreate() throws Exception {
        assertEquals("", HyperlinkAttributedStringFactory.create((DescriptiveUrl.EMPTY)).string());
        assertEquals("", HyperlinkAttributedStringFactory.create((URI) null).string());
        assertEquals("ftp://localhost/d", HyperlinkAttributedStringFactory.create(URI.create("ftp://localhost/d")).string());
    }
}
