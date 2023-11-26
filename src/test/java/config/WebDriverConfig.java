package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${launch}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("size")
    @DefaultValue("1920x1080")
    String size();

    @Key("version")
    @DefaultValue("100.0")
    String version();

    @Key("remoteUrl")
    String getRemoteUrl();
}
