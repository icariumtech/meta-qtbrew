FILESEXTRAPATHS_prepend := "${THISDIR}/wpa-supplicant:"

PR .= ".3"

do_install_prepend () {
    OLDIFS=$IFS;
    IFS=',';
    for network in ${WIRELESS_NETWORKS}; do
        set -- $network;
        echo "network={" >> ${WORKDIR}/wpa_supplicant.conf-sane
        echo "        ssid=\"$1\"" >> ${WORKDIR}/wpa_supplicant.conf-sane
        echo "        psk=\"$2\"" >> ${WORKDIR}/wpa_supplicant.conf-sane
        echo "}" >> ${WORKDIR}/wpa_supplicant.conf-sane
        echo "" >> ${WORKDIR}/wpa_supplicant.conf-sane
    done
    IFS=$OLDIFS;
      
    sed -i 's/JOHNSOGA-PASSKEY/${JOHNSOGA-PSK}/g' ${WORKDIR}/wpa_supplicant.conf-sane
}
