package ru.clevertec.console.serviceClass;

import ru.clevertec.console.Check;
import ru.clevertec.console.ParamMapper;

import java.io.IOException;
import java.util.List;

public interface CheckService {

    // TODO SingleTone???

    void parseParamsToGoodsAndCard(String[] arguments, Check check);
    void checkData(String[] strings, String invalidDataFilePath, Check check);
    List<String> createList(Check check);
    void printToFile(String path, Check check);
    List<String> printToStringList(Check check);
    boolean isValid(String productString);
    String[] convertStringToArray(String text, String regex);
    String convertPathStringToTextString(String path, String delimiter) throws IOException;
    List<ParamMapper> setParamMapper(List<String> params, String regex);
    void printToConsoleFromFile(Check check);
}
