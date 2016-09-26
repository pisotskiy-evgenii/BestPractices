package enums;

class Test {
    public static void main(String[] args) {
        // Planet.values() returns an array containing the constants of this enum type, in the order they're declared.
        for (Planet p : Planet.values()) {
            String s = p.name();

            System.out.println(s + "\tMulti mass and radius " + p.multiMassAndRadius());
        }
        /*
MERCURY	Multi mass and radius 8.0583291E29
VENUS	Multi mass and radius 2.9466214200000002E31
EARTH	Multi mass and radius 3.8115764640000004E31
MARS	Multi mass and radius 2.18134212E30
JUPITER	Multi mass and radius 1.358348E35
SATURN	Multi mass and radius 3.42804384E34
URANUS	Multi mass and radius 2.22005474E33
NEPTUNE	Multi mass and radius 2.5339903999999998E33
         */
    }
}
