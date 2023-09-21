# example-loc-plugin-config-plugin

[![GitHub License](https://img.shields.io/github/license/ChrisCarini/example-loc-plugin-config-plugin?style=flat-square)](https://github.com/ChrisCarini/example-loc-plugin-config-plugin/blob/main/LICENSE)
[![All Contributors](https://img.shields.io/github/all-contributors/ChrisCarini/example-loc-plugin-config-plugin?color=ee8449&style=flat-square)](#contributors)
[![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/ChrisCarini/example-loc-plugin-config-plugin/build.yml?branch=main&logo=GitHub&style=flat-square)](https://github.com/ChrisCarini/example-loc-plugin-config-plugin/actions/workflows/build.yml)
[![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/ChrisCarini/example-loc-plugin-config-plugin/compatibility.yml?branch=main&label=IntelliJ%20Plugin%20Compatibility&logo=GitHub&style=flat-square)](https://github.com/ChrisCarini/example-loc-plugin-config-plugin/actions/workflows/compatibility.yml)


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

## Contributors

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/ChrisCarini"><img src="https://avatars.githubusercontent.com/u/6374067?v=4?s=100" width="100px;" alt="Chris Carini"/><br /><sub><b>Chris Carini</b></sub></a><br /><a href="#bug-ChrisCarini" title="Bug reports">🐛</a> <a href="#code-ChrisCarini" title="Code">💻</a> <a href="#doc-ChrisCarini" title="Documentation">📖</a> <a href="#example-ChrisCarini" title="Examples">💡</a> <a href="#ideas-ChrisCarini" title="Ideas, Planning, & Feedback">🤔</a> <a href="#maintenance-ChrisCarini" title="Maintenance">🚧</a> <a href="#question-ChrisCarini" title="Answering Questions">💬</a> <a href="#review-ChrisCarini" title="Reviewed Pull Requests">👀</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->