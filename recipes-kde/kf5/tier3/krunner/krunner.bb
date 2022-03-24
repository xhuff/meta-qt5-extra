SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "LGPL-2.0-or-later & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    qtdeclarative \
    kauth-native \
    kconfig-native kconfig \
    kcoreaddons-native kcoreaddons \
    kpackage-native \
    ki18n \
    kio \
    kservice \
    plasma-framework \
    solid \
    threadweaver \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "3fc80c5d66359e4593115b58fcd055ca9cab8f23376123094e13c5d4bdc48fed"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevfiletemplates \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
