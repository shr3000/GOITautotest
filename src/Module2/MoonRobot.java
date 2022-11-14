package Module2;

/*
Твоя команда создает робота-лунохода. Ты единственный программист в команде, и именно ты пишешь всю логику.
Нужно так запрограммировать робота, чтобы он нигде не застрял, собрал всю необходимую информацию, и выполнил свою задачу.
Первое, чему нужно научить робота - это преодолевать ямы. Если робот видит перед собой яму, он может ее проехать,
если соблюдается хотя бы одно из двух условий:

1.глубина ямы меньше, чем 34 сантиметра
2. или же если заряд солнечной батареи больше чем 67%, тогда энергии хватит на любую яму
Напиши программу, которая будет определять, может ли робот преодолеть яму.

У робота на пути также будут холмики, на которые он не сможет заехать, но сможет перепрыгнуть. Возможности робота
ограничены, он может прыгать только через невысокие (меньше или равно, чем 150 сантиметров) горы, и лишь если заряд
батареи не меньше 90%. К счастью, у робота довольно точные датчики, которые точно определяют высоту горы и заряд батареи.

У робота есть датчик, который определяет, работает ли мотор, который вращает колеса. И есть датчик, который определяет,
стоит ли робот на месте.
Если один датчик выдает true, а второй false - значит, все нормально. Например, если мотор вращается (true), и робот не
стоит на месте (false) - значит, все работает исправно. Если же оба датчика выдают true (например, и мотор вращается, и
робот стоит на месте) - значит, что-то поломалось. Только один датчик в один момент времени должен выдавать true.

 */

public class MoonRobot {

    //Test output
    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();

        //Should be false
        System.out.println("canOvercomeHole(100, 80) = " + robot.canOvercomeHole(100, 80));
        System.out.println("canJumpOverHill(155, 91) = " + robot.canJumpOverHill(155, 91));
        System.out.println("robot.areSensorsOk(true, true) = " + robot.areSensorsOk(true, true));

    }

    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }

    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return hillHeight <= 150 && batteryPercent >= 90;
    }

    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding) {
        boolean ok = false;
        if (isRobotStanding == true && isEngineWorking == false) ok = true;
        if (isRobotStanding == false && isEngineWorking == true) ok = true;
        return ok;
    }


}
