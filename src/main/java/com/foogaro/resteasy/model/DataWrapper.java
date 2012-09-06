package com.foogaro.resteasy.model;

import com.foogaro.resteasy.model.dto.LibraryResponse;

import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.Serializable;



/*

    To avoid the following error:

16:17:22,593 ERROR [org.jboss.resteasy.core.SynchronousDispatcher.handleFailure] Failed executing GET /library/books
org.jboss.resteasy.plugins.providers.jaxb.JAXBMarshalException: com.sun.xml.bind.v2.runtime.IllegalAnnotationsException: 1 counts of IllegalAnnotationExceptions
Invalid @XmlElementRef : Type "class com.foogaro.resteasy.model.DataWrapper" or any of its subclasses are not known to this context.
    this problem is related to the following location:
        at public com.foogaro.resteasy.model.DataWrapper com.foogaro.resteasy.model.Result.getData()
        at com.foogaro.resteasy.model.Result

    we have to statically add all the objects we will use in our response.
    With RESTeasy 2 you will not need this.
*/


/**
 * @author l.fugaro@gmail.com
 */
@XmlSeeAlso({
        LibraryResponse.class
})
public class DataWrapper implements Serializable {

}
