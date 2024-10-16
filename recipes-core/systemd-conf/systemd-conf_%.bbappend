FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SYSTEMD_AUTO_ENABLE = "enable"

SRC_URI += " \
	file://10-eth.network \
	file://10-en.network \
"

FILES:${PN} += "\
	${sysconfdir}/systemd/network/10-eth.network \
	${sysconfdir}/systemd/network/10-en.network \
"

do_install:append () {
	install -d ${D}${sysconfdir}/systemd/network
    	install -m 0644 ${WORKDIR}/10-eth.network ${D}${sysconfdir}/systemd/network
	install -m 0644 ${WORKDIR}/10-en.network ${D}${sysconfdir}/systemd/network
}
