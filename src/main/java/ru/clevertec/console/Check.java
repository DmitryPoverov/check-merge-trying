package ru.clevertec.console;

import ru.clevertec.console.serviceClass.CheckServiceInterface;
import ru.clevertec.console.serviceClass.ServiceClassInterfaceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Check {

    private static final CheckServiceInterface CHECK_SERVICE_INSTANCE = new ServiceClassInterfaceImpl();
    private String discountCard;
    private List<ParamMapper> paramMappersList = new ArrayList<>();

    public Check() {
    }
    public Check(String[] arguments) {
        CHECK_SERVICE_INSTANCE.parseParamsToGoodsAndCard(arguments, this);
    }
    public Check(String path) throws IOException {
        String contentOfFile = CHECK_SERVICE_INSTANCE.convertPathStringToTextString(path, "");
        String[] argsFromFile = CHECK_SERVICE_INSTANCE.convertStringToArray(contentOfFile, ", ");
        CHECK_SERVICE_INSTANCE.parseParamsToGoodsAndCard(argsFromFile, this);
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
    public CheckServiceInterface getCheckService() {
        return CHECK_SERVICE_INSTANCE;
    }
}
