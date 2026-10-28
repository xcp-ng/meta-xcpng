inherit srpm-intree

RDEPENDS:qemu = "libpng libaio libjpeg-turbo pixman xcp-clipboardd"

# compensate for broken loops on perl-libs
DEPENDS:append = " \
  rpm/perl-Encode \
"

# compensate for broken loops on perl-Getopt-Long
DEPENDS:append = " \
  rpm/perl-Pod-Usage \
"
