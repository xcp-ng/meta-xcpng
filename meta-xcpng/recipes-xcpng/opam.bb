inherit srpm-intree

RDEPENDS:opam = "bubblewrap m4"

# compensate for broken loops on perl-libs
DEPENDS:append = " \
  rpm/perl-Encode \
"

# compensate for broken loops on git
DEPENDS:append = " \
  rpm/perl-Git \
"

# compensate for broken loops on perl-Getopt-Long
DEPENDS:append = " \
  rpm/perl-Pod-Usage \
"
