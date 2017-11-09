package com.linwu.yuanqi.util;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by linwu on 9/29/2017.
 */
public class XmlTest {

    public static void main(String[] args) {

        // 生成一个根结点
        Element rss = new Element("rss");
        // 添加属性
        rss.setAttribute("version", "2.0");
        // 生成document
        Document document = new Document(rss);
        //创建子节点
        Element book = new Element("book");
        rss.addContent(book);
        book.setAttribute("id", "1");
        Element title = new Element("title");
        title.setText("语文");
        book.addContent(title);
        Element language = new Element("language");
        //language.addContent(new CDATA("<===国内最新新闻==>"));
        language.addContent("<===国内最新新闻==>");
        book.addContent(language);

        Format format = Format.getCompactFormat();
        //设置换行
        format.setIndent("");
        format.setExpandEmptyElements(true);
        //format.setEncoding("GBK");

        XMLOutputter outPuter = new XMLOutputter(format);
        // 利用outPuter将document装换成xml
        File file = new File("D:/testXml.xml");
        try {
            outPuter.output(document, new FileOutputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /* 4：从根结点开始构造dom树：

            1）创建结点：Element element=new Element("节点名")；

            2）设置结点属性：element.setAttribute(属性名，属性值);

    3）设置结点文本内容：element.setText(文本内容）;

    4）添加结点到父节点下：father.addContent(child);

    5：dom树构造完毕，进行输出：

            1）创建XMLOutputer:XMLOutputer outputer=new XMLOutputer(format);//format参数可选，可以创建一个format对象设置输出格式，比如换行、编码格式等

    2）通过outputer把dom对象输出到xml文档：outputer.output(dom,new FileOutputStream(xml_file))；*/
}
