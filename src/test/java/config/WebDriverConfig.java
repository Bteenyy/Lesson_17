package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${launch}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();


    @Key("version")
    @DefaultValue("100.0")
    String version();

    @Key("baseUrl")
    @DefaultValue("https://scalablesolutions.io/")
    String baseUrl();


    @Key("remoteUrl")
    String getRemoteUrl();
}
