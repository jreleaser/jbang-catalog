//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 8+
//DEPS org.jreleaser:jreleaser:0.4.0

public class jreleaser {
    public static void main(String... args) throws Exception {
        org.jreleaser.cli.Main.main(args);
    }
}