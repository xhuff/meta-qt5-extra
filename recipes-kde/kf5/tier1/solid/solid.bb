SUMMARY = "Hardware integration and detection"
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += "bison-native qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "8926c859af4b6b14e0967fc3b76ca0e76de27d0ab544087eefdffe40518b5a9c"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"

RRECOMMENDS:${PN} += "udisks2"
