import Vue from 'vue'
import { Button, Tag, Form, FormItem, Input, Message,
Container, Header, Aside, Main, Card, Row, Col, Switch,
Menu, Submenu, MenuItem, Breadcrumb, BreadcrumbItem,
Table, TableColumn, Pagination, Dialog, MessageBox,
Select, Option, Tree, Checkbox, CheckboxGroup
} from 'element-ui'

// 导入elementUI组件
Vue.use(Button)
Vue.use(Tag)
Vue.use(Form)
Vue.use(FormItem)
Vue.use(Input)
Vue.use(Container)
Vue.use(Header)
Vue.use(Aside)
Vue.use(Main)
Vue.use(Menu)
Vue.use(Submenu)
Vue.use(MenuItem)
Vue.use(Breadcrumb)
Vue.use(BreadcrumbItem)
Vue.use(Card)
Vue.use(Row)
Vue.use(Col)
Vue.use(Table)
Vue.use(TableColumn)
Vue.use(Switch)
Vue.use(Pagination)
Vue.use(Dialog)
Vue.use(Select)
Vue.use(Option)
Vue.use(Tree)
Vue.use(Checkbox)
Vue.use(CheckboxGroup)

//将组件挂载到Vue原型上
Vue.prototype.$message = Message
Vue.prototype.$confirm = MessageBox.confirm
