package com.voodoodyne.gwizard.services;

import com.google.common.util.concurrent.ServiceManager;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import javax.inject.Singleton;

@Slf4j
public class ServicesModule extends AbstractModule {

	@Override
	protected void configure() {
	}

	@Provides
	@Singleton
	public ServiceManager serviceManager(Services services) {
		return services.makeServiceManager();
	}
}
