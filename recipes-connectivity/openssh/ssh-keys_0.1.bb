DESCRIPTION = "ssh private & public key packages"
HOMEPAGE = "http://www.yoctoproject.org"
BUGTRACKER = "http://bugzilla.pokylinux.org"

PR = "r4"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://qtbrew.pub;beginline=0;endline=1;md5=8296698bebb36eeea35a08c9af160f6a"

#Note: The keys populated here are just as an example,
# These keys are no more private.
# Do not use same keys for your project
# You are expected to create user own ssh keys to replace these sample keys.

SRC_URI = "file://qtbrew.pub \
    file://ssh_host_rsa_key \
    file://ssh_host_dsa_key \
    file://ssh_host_ecdsa_key \
    file://ssh_host_ed25519_key"
S = "${WORKDIR}"

USER="root"

do_install() {
        install -d ${D}/home/${USER}/.ssh/
        install -m 0755 ${S}/qtbrew.pub ${D}/home/${USER}/.ssh/
        install -m 0755 ${S}/qtbrew.pub ${D}/home/${USER}/.ssh/authorized_keys

	install -d ${D}${sysconfdir}/ssh
	install -m 0600 ${S}/ssh_host_rsa_key ${D}${sysconfdir}/ssh/ssh_host_rsa_key
	install -m 0600 ${S}/ssh_host_dsa_key ${D}${sysconfdir}/ssh/ssh_host_dsa_key
	install -m 0600 ${S}/ssh_host_ecdsa_key ${D}${sysconfdir}/ssh/ssh_host_ecdsa_key
	install -m 0600 ${S}/ssh_host_ed25519_key ${D}${sysconfdir}/ssh/ssh_host_ed25519_key
}

FILES_${PN} += "/home/${USER}/.ssh/qtbrew.pub \
     /home/${USER}/.ssh/authorized_keys \
     ${sysconfdir}/ssh/*"
