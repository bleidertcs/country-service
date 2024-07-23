package org.wj.prajumsook;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.quarkus.security.Authenticated;

@ApplicationPath("/api")
// @Authenticated
public class CountryApplication extends Application {

}
