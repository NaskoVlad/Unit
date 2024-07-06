public class LinkedStack {
    private Node tail; // ссылка на последний добавленный узел (обёртку)
    private int size; // размер стека, т.е. количество элементов в нём

    public void push(int value) {
        Node node = new Node(value); // создаём новый узел
        if (tail != null) { // если в стеке уже есть элементы
            node.setPrev(tail); // связываем новый узел с последним
        }
        tail = node; // назначаем новый узел последним узлом
        size++; // увеличиваем счётчик элементов
    }

    public int pop() {
        int value = 0;
        if (tail != null) {
            value = tail.getValue();

        }
        tail = tail.getPrev();
        size--;
        return value;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        boolean result;
        if (size == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public String toString() {
        Node copyTail = tail;
        StringBuilder str = new StringBuilder();
        int copySize = size;
        int result;
        if (copyTail != null) {
            while (copySize > 0) {
                result = copyTail.getValue();
                if (copySize > 1) {
                    str.append(result).append(" -> ");
                    copyTail = copyTail.getPrev();
                } else {
                    str.append(result);
                }
                copySize--;
            }
        } else {
            str.append("EMPTY");
        }
        return str.toString();
        // если есть элементы, пройдитесь по связному списку,
        // выводя элементы.
        // вывод должен быть в точности как в комментариях к main
        // при этом этот метод не должен менять стек!
    }
}
