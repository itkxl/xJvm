package icu.itkxl.xjvm.classfile;


/**
 * @Author: itkxl
 * @Date: 2020/11/2 11:03 AM
 * description:
 */
public class ClassFile {

    private int magic;
    private int minorVersion;
    private int majorVersion;
    private int constantPoolCount;
    private ConstantPool constantPool;
    private int accessFlag;
    private int thisClass;
    private int superClass;
    private Interfaces interfaces;
    private int fieldsCount;
    private Fields fields;
    private int methodsCount;
    private Methods methods;
    private int attributesCount;
    private Attributes attributes;




}
