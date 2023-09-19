# Dự án Quản lý Người dùng sử dụng Spring Boot và MySQL

## Mục tiêu dự án
Dự án này nhằm xây dựng một ứng dụng web đơn giản để quản lý thông tin người dùng. Ứng dụng cho phép thêm, sửa, xóa và hiển thị danh sách người dùng. Chúng ta sử dụng cơ sở dữ liệu MySQL để lưu trữ thông tin người dùng và Spring Boot để xây dựng ứng dụng web.

## Hướng dẫn cài đặt
1. **Clone dự án từ kho lưu trữ Git:**
https://github.com/tieulong-cmd/MyWebApp.git
2. **Thiết lập cơ sở dữ liệu MySQL:**
- Cài đặt và khởi động máy chủ MySQL.
- Tạo một cơ sở dữ liệu có tên "usersdb".

3. **Cấu hình ứng dụng:**
- Trong tệp `application.properties` (src/main/resources/application.properties), cập nhật các thông tin cơ sở dữ liệu:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/usersdb
  spring.datasource.username=root
  spring.datasource.password=123456
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.properties.hibernate.show_sql=true

4. **Chạy ứng dụng Spring Boot:**
- Sử dụng Maven:
  ```
  mvn spring-boot:run
  ```
- Hoặc chạy ứng dụng từ IDE của bạn.

5. **Truy cập ứng dụng:**
- Mở trình duyệt và truy cập địa chỉ [http://localhost:8080](http://localhost:8080).

## Hướng dẫn sử dụng
- Đăng nhập vào ứng dụng bằng tài khoản người dùng.
- Trong trình quản lý người dùng, bạn có thể thực hiện các thao tác sau:
- **Thêm Người dùng:** Nhấn vào "Add new user" và điền thông tin người dùng mới.
- **Sửa Người dùng:** Nhấn vào "Edit" để chỉnh sửa thông tin người dùng hiện có.
- **Xóa Người dùng:** Nhấn vào "Delete" để xóa một người dùng.
- **Hiển thị Danh sách Người dùng:** Danh sách người dùng sẽ được hiển thị trên trang quản lý.

## Cấu trúc thư mục
- `src/`: Mã nguồn ứng dụng Spring Boot.
- `src/main/resources/`: Tệp cấu hình và tệp Thymeleaf templates.
- `sql/`: Scripts SQL để tạo cơ sở dữ liệu.

## Liên hệ
- Email: tieulong.cmd@gmail.com

## Mô tả công nghệ
- Spring Boot
- MySQL
- Thymeleaf
