plugins {
    id("build-standard-jetbrains-plugin-build")
}


// TODO(ChrisCarini) - GET THE BELOW WORKING.

//intellij {
//    // We set a custom plugin repository (only in local dev) so that we can point to a locally built version of the LoC plugin
//    if (System.getenv('CI') != "true") {
//        pluginsRepositories {
//            def url = new File("${projectDir}/updatePlugins.xml").toURI().toURL().toString()
//
//            final LOC_VERSION = project.findProperty("locPluginVersion").toString()
//            final CURRENT_PLUGIN_FILENAME = "'LoC Change Count Detector'-${LOC_VERSION}.zip"
//            final CORRECT_PLUGIN_FILENAME = "LoC_Change_Count_Detector-${LOC_VERSION}.zip"
//            final locProjectBuildDistDir = "${projectDir.parent}/loc-change-count-detector-jetbrains-plugin/build/distributions"
//
//            logger.lifecycle("Fix LoC Plugin Zip file name...")
//            copy {
//                from(file("${locProjectBuildDistDir}/${CURRENT_PLUGIN_FILENAME}"))
//                into(file("${locProjectBuildDistDir}/"))
//                include CURRENT_PLUGIN_FILENAME
//                        rename CURRENT_PLUGIN_FILENAME, CORRECT_PLUGIN_FILENAME
//            }
//
//            logger.lifecycle("Generate [updatePlugins.xml]...")
//            // Take template file, replace needed text...
//            final s = file("${projectDir}/updatePlugins.template.xml")
//                .text
//                .replaceAll('PATH_TO_REPLACE', "${projectDir.parent.substring(1)}")
//                .replaceAll('LOC_VERSION_TO_REPLACE', LOC_VERSION)
//                .replaceAll('CORRECT_PLUGIN_FILENAME', CORRECT_PLUGIN_FILENAME)
//
//            // ... and write the file back out
//            file("${projectDir}/updatePlugins.xml").write(s)
//
//            logger.lifecycle(String.format("Setting custom pluginRepository URL: %s", url))
//            custom(url)
//        }
//    }
//}
