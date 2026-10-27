inherit srpm-intree

RDEPENDS:blktap = "libaio"

# compensate for broken loops on git
DEPENDS:append = " \
  rpm/perl-Git \
"

# compensate for broken loops on perl-Getopt-Long
DEPENDS:append = " \
  rpm/perl-Pod-Usage \
"
