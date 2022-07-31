# example-loc-plugin-config-plugin

[![GitHub License](https://img.shields.io/github/license/ChrisCarini/example-loc-plugin-config-plugin?style=flat-square)](https://github.com/ChrisCarini/example-loc-plugin-config-plugin/blob/main/LICENSE)
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/ChrisCarini/example-loc-plugin-config-plugin/Build?logo=GitHub&style=flat-square)](https://github.com/ChrisCarini/example-loc-plugin-config-plugin/actions?query=workflow%3A%22Build%22)
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/ChrisCarini/example-loc-plugin-config-plugin/IntelliJ%20Plugin%20Compatibility?label=IntelliJ%20Plugin%20Compatibility&logo=GitHub&style=flat-square)](https://github.com/ChrisCarini/example-loc-plugin-config-plugin/actions?query=workflow%3A%22IntelliJ+Plugin+Compatibility%22)


<!-- Plugin description -->
An example plugin for configuring [ChrisCarini/loc-change-count-detector-jetbrains-plugin](https://github.com/ChrisCarini/loc-change-count-detector-jetbrains-plugin) via another JetBrains plugin (ie, this plugin).
<!-- Plugin description end -->

_**Note:** The plugin was created purely as a PoC to be used as a reference._

### Developer Notes

This plugin assumes that you have a local checkout of [ChrisCarini/loc-change-count-detector-jetbrains-plugin](https://github.com/ChrisCarini/loc-change-count-detector-jetbrains-plugin) in a sibling directory to this repository.

```bash
plugins/
├── example-loc-plugin-config-plugin
│   ├── build.gradle
│   ├── ...
│   └── settings.gradle
└── loc-change-count-detector-jetbrains-plugin
    ├── build.gradle
    ├── ...
    └── settings.gradle
```

