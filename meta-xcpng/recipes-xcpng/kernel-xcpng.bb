inherit srpm-intree

SPECFILE = "SPECS/kernel.spec"

# compensate for broken loops on perl-libs
DEPENDS:append = " \
  rpm/perl-Carp \
  rpm/perl-Encode \
  rpm/perl-Exporter \
"

# compensate for broken loops on perl-Getopt-Long
DEPENDS:append = " \
  rpm/perl-Pod-Usage \
"
