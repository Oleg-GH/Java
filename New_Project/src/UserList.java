//package SeminarOOP4_1403_HW2;

public class UserList<T> {
    private static final int FIRSTCAPACITY = 1;
    private int len;
    private T[] elements;
    
    public UserList() {
        this.len = 0;
        this.elements = (T[]) new Object[FIRSTCAPACITY];
    }

    public UserList(T[] elements) {
        this.len = elements.length;
        this.elements = elements;
    }

    public int getLen() {
        return this.len;
    }

    public T[] getElements() {
        return this.elements;
    }

    public void print() {
        System.out.println(this);
    }

    
    public boolean add(T element) {
        if (this.len == this.elements.length) {
            growArr();
        }
        this.elements[this.len++] = element;
        return true;
    }

    // увеличение размера массива, если нет свободного места
    private void growArr() {
        int newCapacity = this.getLen() * 2;
        T[] newElements = (T[]) new Object[newCapacity];
        for (int i = 0; i < this.getLen(); i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
    }


    public T remove(int idx) {
        checkIndex(idx);
        T removed = this.elements[idx];

        for (int i = idx; i < this.getLen() - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.len--;
        return removed;
    }

    
    private void checkIndex(int idx) throws IndexOutOfBoundsException {
        if (idx < 0 || idx >= this.getLen()) {
            throw new IndexOutOfBoundsException(
                    String.format("Индекс %d вне пределов длины массива %d",
                            idx, this.getLen()));
        }
    }


    public boolean removeAll(T elem) {
        int count = 0;
        int arrTail = this.getLen();
        boolean isChanged = false;

        for (int i = 0; i < arrTail; i++) {
            if (this.elements[i].equals(elem)) {
                count++;
                arrTail--;
                isChanged = true;
                for (int j = i; j < this.getLen() - 1; j++) {
                    swap(j, j + 1);
                }
            }
        }

        this.len -= count;
        return isChanged;
    }

    
    public T getMin() throws NonComparableTypeException {
        return getMinOrMax(false);
    }

    
    public T getMax() throws NonComparableTypeException {
        return getMinOrMax(true);
    }

    
    private T getMinOrMax(boolean getMax) throws NonComparableTypeException {
        T result = this.elements[0];
        if (result instanceof Comparable) {
            for (int i = 1; i < this.getLen(); i++) {
                Comparable<T> elem = (Comparable<T>) this.elements[i];
                if (getMax) {
                    if (elem.compareTo(result) > 0) {
                        result = this.elements[i];
                    }
                } else {
                    if (elem.compareTo(result) < 0) {
                        result = this.elements[i];
                    }
                }
            }
            return result;
        }
        throw new NonComparableTypeException(result.getClass().getSimpleName());
    }

    public int sum() {
        if (len == 0) {
            System.out.println("Массив пуст");
        }
        int rez = 0;
        for (int i = 0; i < len; i++) {

            if (this.elements[i] instanceof Integer) {
                rez += (int)this.elements[i];
            }
            //return (int) rez;
        }

        return rez;
    }

    public int multi() {
        if (len == 0) {
            System.out.println("Массив пуст");
        }
        int mult = 1;
        for (int i = 0; i < len; i++) {

            if (this.elements[i] instanceof Integer) {
                mult *= (int)this.elements[i];
            }
        }
        return mult;
    }

    // определение индекса элемента (если не найден, то -1)
    public int indexOf(T element) {
        for (int i = 0; i < this.getLen(); i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // определяем наличие элемента в массиве
    public boolean contains(T element) {
        //return this.indexOf(element) != -1;
        for (int i = 0; i < len; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    // меняем элементы местами (вспомогательный метод)
    private void swap(int i, int j) {
        T tmp = this.elements[i];
        this.elements[i] = this.elements[j];
        this.elements[j] = tmp;
    }

    // сортировка пузырьком
    public void BubbleSort() throws NonComparableTypeException {
        T tmp = this.elements[0];
        if (tmp instanceof Comparable) {
            for (int i = 0; i < this.getLen() - 1; i++) {
                boolean hasSwap = false;

                for (int j = 0; j < this.getLen() - i - 1; j++) {
                    Comparable<T> elem = (Comparable<T>) this.elements[j];
                    T nextElem = this.elements[j + 1];
                    if (elem.compareTo(nextElem) > 0) {
                        swap(j, j + 1);
                        hasSwap = true;
                    }
                }

                if (!hasSwap) {
                    break;
                }
            }
        } else {
            throw new NonComparableTypeException(tmp.getClass().getSimpleName());
        }
    }

    // сортировка вставками
    public void InsertionSort() throws NonComparableTypeException {
        T tmp = this.elements[0];
        if (tmp instanceof Comparable) {
            for (int i = 1; i < this.getLen(); i++) {
                for (int j = i; j > 0; j--) {
                    Comparable<T> elem = (Comparable) this.elements[j];
                    T prevElem = this.elements[j - 1];
                    if (elem.compareTo(prevElem) < 0) {
                        swap(j, j - 1);
                    } else {
                        break;
                    }
                }
            }
        } else {
            throw new NonComparableTypeException(tmp.getClass().getSimpleName());
        }
    }

    // сортировка выбором
    public void SelectionSort() throws NonComparableTypeException {
        T min = this.elements[0];
        if (min instanceof Comparable) {
            for (int i = 0; i < this.getLen(); i++) {
                min = this.elements[i];
                int min_idx = i;

                for (int j = i; j < this.getLen(); j++) {
                    Comparable<T> elem = (Comparable<T>) this.elements[j];
                    if (elem.compareTo(min) < 0) {
                        min = this.elements[j];
                        min_idx = j;
                    }
                }

                if (i != min_idx) {
                    swap(i, min_idx);
                }
            }
        } else {
            throw new NonComparableTypeException(min.getClass().getSimpleName());
        }
    }

    // получаем элемент по индексу
    public T get(int idx) {
        checkIndex(idx);
        return this.elements[idx];
    }

    // замена элемента массива на новый по индексу
    public T set(int idx, T newElem) {
        checkIndex(idx);
        T replaced = this.elements[idx];
        this.elements[idx] = newElem;
        return replaced;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.getLen(); i++) {
            sb.append(this.elements[i]);
            if (i != this.getLen() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}



//    public T sum() {
//        if (len == 0) {
//            System.out.println("Массив пуст");
//        }
//
//        if (this.elements[0] instanceof Integer){
//            int rez = 0;
//            for (int i = 0; i < len; i++) {
//
//            //if (this.elements[i] instanceof Integer) {
//                rez += (int)this.elements[i];
//            }
//            //return (int) rez;
//        }
//
//        return (T) rez;
//    }

//    public int sum(){                   //6
//        int sum = 0;
//        for (int i = 0; i < len; i++) {
//            if (this.elements.get(i) instanceof Integer){
//                sum += (int)elements.get(i);
//            }
//        }
//        return sum;
//    }

//    public T sum() {
//        if (this.elements.get(0) instanceof String) {
//            String sum = "";
//            for (T element : elements) sum += (String) element;
//            return (T) sum;
//        }
//
//        if (elements.get(0) instanceof  Integer) {
//            Integer sum = 0;
//            for (T element : elements) sum += (Integer) element;
//            return (T) sum;
//        }
//
//        if (elements.get(0) instanceof  Double) {
//            Double sum = 0.;
//            for (T element : elements) sum += (Double) element;
//            return (T) sum;
//        }
//        return null;
//    }
