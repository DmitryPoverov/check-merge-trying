package ru.clevertec.console;

import ru.clevertec.console.serviceClass.CheckService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Check {

    private final CheckService service;
    private String discountCard;
    private List<ParamMapper> paramMappersList = new ArrayList<>();

    public Check(CheckService checkService) {
        service = checkService;
    }
    public Check(CheckService checkService, String[] arguments) {
        service = checkService;
        service.parseParamsToGoodsAndCard(arguments, this);
    }
    public Check(CheckService checkService, String path) throws IOException {
        service = checkService;
        String contentOfFile = service.convertPathStringToTextString(path, "");
        String[] argsFromFile = service.convertStringToArray(contentOfFile, ", ");
        service.parseParamsToGoodsAndCard(argsFromFile, this);
    }

    public void setParamMappersList(List<ParamMapper> paramMappersList) {
        this.paramMappersList = paramMappersList;
    }
    public void setDiscountCard(String discountCard) {
        this.discountCard = discountCard;
    }
    public String getDiscountCard() {
        return discountCard;
    }
    public List<ParamMapper> getParamMappersList() {
        return paramMappersList;
    }
    public CheckService getCheckService() {
        return service;
    }

    @Override
    public String toString() {
        return "Check{" + "Card='" + discountCard + '\'' + ", List=" + paramMappersList + '}';
    }
}
