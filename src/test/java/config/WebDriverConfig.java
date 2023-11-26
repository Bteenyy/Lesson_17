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
    String baseUrl();

    @Key("remote")
    String getRemote();

    @Key("remoteUrl")
    String getRemoteUrl();
}
