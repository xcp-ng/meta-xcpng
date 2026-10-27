inherit srpm-intree

RDEPENDS:ocaml = "gcc"

# compensate for broken loops on perl-libs
DEPENDS:append = " \
  rpm/perl-Encode \
"

# compensate for broken loops on perl-Getopt-Long
DEPENDS:append = " \
  rpm/perl-Pod-Usage \
"

# compensate for broken loops on git
DEPENDS:append = " \
        rpm/perl-Git \
"
