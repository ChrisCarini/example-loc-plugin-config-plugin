package com.chriscarini.jetbrains.examplelocconfigurationplugin;


import com.chriscarini.jetbrains.locchangecountdetector.ChangeThresholdService;
import com.chriscarini.jetbrains.locchangecountdetector.LoCService;
import com.chriscarini.jetbrains.locchangecountdetector.data.ChangeThresholdIconInfo;
import com.chriscarini.jetbrains.locchangecountdetector.data.ChangeThresholdTimeInfo;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


/**
 * Configures LoC Thresholds for the default project.
 */
public class LoCThresholdConfigurer implements StartupActivity, StartupActivity.DumbAware {
    private static final @NonNls Logger LOG = Logger.getInstance(LoCThresholdConfigurer.class);

    @Override
    public void runActivity(@NotNull Project project) {
        projectOpened(project);
    }

    public void projectOpened(@NotNull Project project) {
        if (!ApplicationManager.getApplication().isUnitTestMode()) {
            final ChangeThresholdService changeThresholdService = ChangeThresholdService.getInstance(project);
            changeThresholdService
                .changeThresholdTimeInfos(
                    new ArrayList<>(List.of(
                        new ChangeThresholdTimeInfo("S", 10, 1, 2),
                        new ChangeThresholdTimeInfo("M", 20, 3, 4),
                        new ChangeThresholdTimeInfo("L", Integer.MAX_VALUE, 5, 6)
                    ))
                )
                .changeThresholdIconInfo(
                    new ChangeThresholdIconInfo(100, 75, 50)
                );
            LoCService.getInstance(project).computeLoCInfo();
        }
    }
}
