//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 8
//REPOS jitpack
//DEPS com.github.jreleaser:jreleaser:main-SNAPSHOT

public class jreleaser_snapshot {
    public static void main(String... args) throws Exception {
        org.jreleaser.cli.Main.main(args);
    }
}