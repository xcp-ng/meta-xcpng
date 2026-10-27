inherit srpm-intree

RDEPENDS:xen-dom0-libs = "lzo xen-libs e2fsprogs-libs"
RDEPENDS:xen-dom0-libs-devel = "xen-dom0-libs"
RDEPENDS:xen-dom0-tests = "xen-dom0-libs"
RDEPENDS:xen-dom0-tools = "xen-dom0-libs edk2 ipxe libempserver qemu systemd"
RDEPENDS:xen-ocaml-libs = "ocaml-runtime xen-dom0-libs ocaml"
RDEPENDS:xen-ocaml-devel = "ocaml xen-ocaml-libs ocaml"
RDEPENDS:xen-oxenstored = "xen-dom0-libs"
RDEPENDS:xen-tools = "xen-dom0-libs lzo"

# compensate for broken loops on perl-Getopt-Long
DEPENDS:append = " \
  rpm/perl-Pod-Usage \
"
