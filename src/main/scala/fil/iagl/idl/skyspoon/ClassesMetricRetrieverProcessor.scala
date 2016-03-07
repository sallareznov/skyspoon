package fil.iagl.idl.skyspoon

import spoon.processing.AbstractProcessor
import spoon.reflect.declaration.CtType

class ClassesMetricRetrieverProcessor extends AbstractProcessor[CtType[_]] {

  override def isToBeProcessed(ctType: CtType[_]): Boolean = ctType.isTopLevel

  override def process(element: CtType[_]): Unit = ???

}
