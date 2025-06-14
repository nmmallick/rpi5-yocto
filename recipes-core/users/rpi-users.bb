LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

inherit useradd

USERADD_PACKAGES = "${PN}"

# openssl -6
USER_NAME = "rpi"
USER-PASSWD = "\$6\$hDZa.ef4zXWDWIXx\$lK6ZP1iQJhv7rg/ZNN.CUWURVIUQDm835h5YG8tDiBJ7YbfAbTppdNDph5e11AiCuirh.v1A8u1slAx1V7xGW0"

USERADD_PARAM:${PN} = "-u 1001 -d /home/${USER_NAME} -G dialout -s /bin/sh -p '${USER_PASSWD}' ${USER_NAME}"
