package Modul2;
/*
Напиши класс MoonRobotVespenGasDetector. У этого класса должны быть следующие методы:

public boolean isAcidOk(int acidValue, int minAcid, int maxAcid). Подходит ли грунт по кислотности. Принимает три
параметра - кислотность грунта, минимально допустимое и максимально допустимые значения. Возвращает true, если
показатель acidValue лежит в промежутке от minAcid до maxAcid включительно;

public boolean isDensityOk(int density). Подходит ли грунт по плотности. Веспен-газ встречается в точках,
где плотность грунта лежит в промежутке от 1000 до 5000 включительно, ИЛИ же в промежутке от 10000 до 15000 включительно;

public boolean isTemperatureOk(boolean cold). Примитивный датчик температуры выдает булево значение температуры
лишь как true если грунт холодный, и false - если грунт теплый. Нам подходит лишь теплый грунт. Поэтому метод
должен возвращать true, лишь если грунт не холодный.

public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) - метод,
который выдает финальный вердикт, стоит ли копать в этой точке. Он принимает все параметры, которые принимает метод
выше. Использует все перечисленные выше методы, и возвращает true, если грунт проходит по всем параметрам, и false,
если грунт не проходит хотя бы по одному параметру.
 */

public class MoonRobotVespenGasDetector {

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density) {
        return (density >= 1000 && density <= 5000) || (density >= 10000 && density <= 15000);
    }

    public boolean isTemperatureOk(boolean cold) {
        if (cold) return false;
        return true;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        return (isAcidOk(acidValue, minAcid, maxAcid) == true && isDensityOk(density) == true && isTemperatureOk(cold) == true) ? true : false;
    }
}
