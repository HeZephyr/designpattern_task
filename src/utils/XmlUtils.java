package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlUtils {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String name) {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("config.xml"));

            //获取包含类名的文本结点
            NodeList nodeList = document.getElementsByTagName(name);
            Node classNode = nodeList.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(className);
            Object obj = c.getDeclaredConstructor().newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}