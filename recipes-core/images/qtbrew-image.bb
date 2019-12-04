inherit core-image
inherit extrausers
inherit populate_sdk_qt5

IMAGE_FEATURES = "ssh-server-openssh"

EXTRA_USERS_PARAMS = "usermod -P root root;"

IMAGE_INSTALL += " \
	qtbase \
	qtserialport \
	qtcharts \
	qtvirtualkeyboard \
	qtquickcontrols2 \
	qtdeclarative \
        qtgraphicaleffects \
	qtbrew \
	fontconfig \
	packagegroup-fonts-truetype \
	ttf-droid-sans \
	ttf-droid-sans-mono \
        libgpiod \
        libgpiod-tools \
        ssh-keys \
        openssh-sftp-server \
        rsync \
"
