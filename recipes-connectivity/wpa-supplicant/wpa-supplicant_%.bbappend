FILESEXTRAPATHS_prepend := "${THISDIR}/wpa-supplicant:"

PR .= ".1"

do_install_prepend () {
    sed -i 's/JOHNSOGA-PASSKEY/${JOHNSOGA-PSK}/g' ${WORKDIR}/wpa_supplicant.conf-sane
}
