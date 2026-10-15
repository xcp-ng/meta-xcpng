inherit srpm-intree

RDEPENDS:xen-dom0-libs = "lzo xen-libs"
RDEPENDS:xen-dom0-libs-devel = "xen-dom0-libs"
RDEPENDS:xen-dom0-tests = "xen-dom0-libs"
RDEPENDS:xen-dom0-tools = "xen-dom0-libs edk2 ipxe libempserver qemu"
RDEPENDS:xen-ocaml-libs = "ocaml-runtime xen-dom0-libs"
RDEPENDS:xen-ocaml-devel = "ocaml xen-ocaml-libs"
RDEPENDS:xen-oxenstored = "xen-dom0-libs"
RDEPENDS:xen-tools = "xen-dom0-libs lzo"
