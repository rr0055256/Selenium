from selenium import webdriver

driver = webdriver.Chrome("/usr/lib/chromium-browser/chromedriver")

driver.implicitly_wait(15)

driver.get("http://www.google.com")

searchField = driver.find_element_by_css_selector("input[name=q]")

driver.quit()