package dev.rohrjaspi.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(id = "velocity", name = "Velocity", version = "1.0", url = "https://rohrjaspi.de", authors = {"rohrjaspi"})
public class Main {

	@Inject
	private Logger logger;

	@Subscribe
	public void onProxyInitialization(ProxyInitializeEvent event) {
	}
}
