# A single virtual package provided by more than one package is
# problematic when creating per-recipe symlink pointing to the
# relevant package (a symlink can only point to one target).  This
# makes the unwanted ones not provide the virtual package.
python() {
    virtual_langpack = f"virtual/glibc-langpack_eq_{d.getVar('PV')}-{d.getVar('PR')}"
    for pkg in d.getVar('PACKAGES').split():
        if pkg.startswith('glibc-langpack-') and pkg != 'glibc-langpack-en':
            rprov = d.setVar(f"RPROVIDES:{pkg}:remove:{d.getVar('MACHINE')}", virtual_langpack)
    d.setVar(f"RPROVIDES:glibc-minimal-langpack:remove:{d.getVar('MACHINE')}",
             virtual_langpack)
    d.setVar(f"RPROVIDES:glibc-all-langpacks:remove:{d.getVar('MACHINE')}",
             f"virtual/glibc-langpack-en_or_glibc-all-langpacks {virtual_langpack}")
}
