package Day01.review.InterFaceType;
//Eğer bir generic bir Interface implement ederseniz, ozaman class da generic olmalıdır
public class  GenericClassİmplement<T> implements GenericInterFace <T>{
    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
