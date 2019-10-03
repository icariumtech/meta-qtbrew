inherit core-image
inherit extrausers

IMAGE_FEATURES = "splash ssh-server-openssh"

EXTRA_USERS_PARAMS = "usermod -P root root;"

IMAGE_INSTALL += " \
	qtbase \
	qtserialport \
	qtcharts \
	qtvirtualkeyboard \
	qtquickcontrols2 \
	qtdeclarative \
	qtbrew \
	fontconfig \
	packagegroup-fonts-truetype \
	ttf-droid-sans \
	ttf-droid-sans-mono \
"
