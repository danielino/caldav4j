 /* Copyright 2008 Babel srl
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */
package org.osaf.caldav4j.model.request;

import org.apache.jackrabbit.webdav.xml.Namespace;
import org.apache.jackrabbit.webdav.xml.XmlSerializable;
import org.osaf.caldav4j.CalDAVConstants;
import org.osaf.caldav4j.exceptions.DOMValidationException;
import org.osaf.caldav4j.xml.OutputsDOMBase;

import java.util.Collection;
import java.util.Map;



/**
 * Identifies the content of the element as a URI.
 *
 * <!ELEMENT href (#PCDATA)>
 * 
 *  ex. <D:HREF>
 *  @see <a href=http://tools.ietf.org/html/rfc2518#section-12.3></a>
 * @author rpolli@babel.it
 * 
 */
public class DavHref extends OutputsDOMBase {
    
    public static final String ELEMENT_NAME = "href";

    private String uri = null;

	/**
	 * @param uri URI to the component
	 */
	public DavHref(String uri) {
		this.uri = uri;
    }

    protected String getElementName() {
        return ELEMENT_NAME;
    }

    protected Namespace getNamespace() {
        return CalDAVConstants.NAMESPACE_WEBDAV;
    }
    
    protected String getUri() {
		return uri;
	}
    
    protected void setUri(String u) {
    	uri=u;
	}
    
	protected String getTextContent() {
		return uri;
	}


	/**
	 * Nothing to validate, except for containing uri.
	 */
    public void validate() throws DOMValidationException{
    	return;
    }

	/**
	 * No other attributes
	 * @return
	 */
	@Override
	protected Map<String, String> getAttributes() {
		return null;
	}

	/**
	 * No children
	 */
	@Override // it has no children
	protected Collection<XmlSerializable> getChildren() {
		return null;
	}

}
