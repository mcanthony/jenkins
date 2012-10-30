/*
 The MIT License

 Copyright (c) 2012, Dominik Bartholdi

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
package hudson.maven.settings;

import java.util.List;

public interface ConfigProviderFacade {

    /**
     * Gets all maven (non global) settings available
     * 
     * @since 1.426
     * @return list of all settings
     */
    public List<SettingConfig> getAllMavenSettingsConfigs();

    /**
     * Gets all global maven settings
     * 
     * @since 1.426
     * @return list of all global settings
     */
    public List<SettingConfig> getAllGlobalMavenSettingsConfigs();

    /**
     * Gets a settings config by its id.
     * 
     * @param settingsConfigId
     *            the id of the config to get
     * @return the settings config
     */
    public SettingConfig findConfig(String settingsConfigId);

}