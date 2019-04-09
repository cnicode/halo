package run.halo.app.service;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;
import run.halo.app.model.entity.ThemeSetting;

import java.util.List;
import java.util.Map;

/**
 * Theme setting service interface.
 *
 * @author johnniang
 * @date 4/8/19
 */
public interface ThemeSettingService {


    /**
     * Saves theme setting.
     *
     * @param key     setting key must not be blank
     * @param value   setting value
     * @param themeId theme id must not be blank
     * @return theme setting or null if the key does not exist
     */
    @Nullable
    @Transactional
    ThemeSetting save(@NonNull String key, @Nullable String value, @NonNull String themeId);

    /**
     * Saves theme settings.
     *
     * @param settings theme setting map
     * @param themeId  theme id must not be blank
     */
    @Transactional
    void save(@Nullable Map<String, String> settings, @NonNull String themeId);

    /**
     * Lists theme settings by theme id.
     *
     * @param themeId theme id must not be blank
     * @return a list of theme setting
     */
    @NonNull
    List<ThemeSetting> listBy(String themeId);

    /**
     * Lists theme settings as map.
     *
     * @param themeId theme id must not be blank
     * @return theme setting map
     */
    @NonNull
    Map<String, String> listAsMapBy(@NonNull String themeId);
}
