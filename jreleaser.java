//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 11
//REPOS jitpack
//DEPS com.github.jreleaser.jreleaser:jreleaser:early-access

public class jreleaser {
    public static void main(String... args) throws Exception {
        org.jreleaser.cli.Main.main(args);
    }
}
