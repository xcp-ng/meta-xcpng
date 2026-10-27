inherit srpm-intree

# do not pull xcp-ng-release
DIST_RELEASE_PACKAGES = ""

RDEPENDS:${PN} = " \
python3 \
"
