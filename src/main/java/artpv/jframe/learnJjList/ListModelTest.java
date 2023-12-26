package artpv.jframe.learnJjList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ListModelTest extends JFrame {
    // модель списка
    private DefaultListModel<String> dlm = new DefaultListModel<>();

    private final String[] data1 = {"Tea", "Coffee", "Water", "Juice"};
    private final String[] data2 = {"ChildGarden", "School", "High school", "University"};

    public ListModelTest(){
        super("Example with JList");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Создание панели
        JPanel contents = new JPanel();

        //Наполнение модели данными
        for(String string: data2){
            dlm.add(0, string);
        }

        // Создание кнопки
        JButton add = new JButton ("Добавить");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dlm.add(dlm.getSize(), "-- New Record --" );
                validate();
            }
        });
        JList<String> list1 = new JList<>(data1);
        JList<String> list2 = new JList<>(dlm);

        // Вектор данных
        Vector<String> big = new Vector<>();
        for(int i = 0; i < 15; i++){
            big.add("~ " + i + ". ~");
        }
        JList<String> bigList = new JList<>(big);
        bigList.setPrototypeCellValue("12345"); //определяет  ширину визуального списка

        // Размещение компонентов на панели
        contents.add(add);
        contents.add(new JScrollPane(list1));
        contents.add(new JScrollPane(list2));
        contents.add(new JScrollPane(bigList));

        setContentPane(contents);
        // Вывод окна
        setSize(400, 200);
        setVisible(true);

    }
}
